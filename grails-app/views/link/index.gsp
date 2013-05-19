<h1>Link Like</h1>

<g:form name="linkCreateForm" url="[action:'create']">
  Title: <g:textField name="title"/><br/>
  URL: <g:textField name="url"/><br/>
  <input type="submit" value="Add new link"/>
</g:form>

<hr>

<ul>
  <% if(links.size() == 0) { %>
    <li><b>No links</b></li>
  <% } else { %>
    <% for(link in links) { %>
    <g:form name="voteContent" url="[action:'vote', id:link.id]">
      <li>
        <%= "<b>Title:</b> "+link.title %> </br>
        <%= "<b>Url:</b> "+link.url %> </br>
        <%= "<b>Vote:</b> "+ link.vote %>   </br>
      </li>
    <input type="submit" value="Vote!"/>
    </g:form>
      
    <% } %> 
  <% } %>
</ul>
