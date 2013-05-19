package linklike



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(LinkController)
@Mock([Link])
class LinkControllerTests {

    void testVoteOneLink() {
    	def link = new Link(title: '1', url:'a', vote: 5)
    	link.save()
    	params.id = link.id
    	controller.vote()
    	assertEquals 6, link.vote
    }

    void testCreateLinkSuccess(){
    	assertEquals 0, Link.count()
    	params.title = "bing"
    	params.url = "www.bing.com"
    	controller.create()
    	assertEquals 1, Link.count()
    }
}
