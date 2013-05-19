package linklike



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Link)
class LinkTests {

    void testVoteIncreasedCorrect() {
    	def l = new Link(title: 'search engine',url: 'www.bing.com',vote: 0)
    	l.increaseVote()
    	assertEquals 1, l.vote
    	l.increaseVote()
    	l.increaseVote()
    	assertEquals 3, l.vote
    }
}
