<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
 <head>
  <link  rel="stylesheet" href="/css/stylenew1.css" />
</head>
    <body class="page">
         <div class="smallimage"><img src="/images/smallbook3.png"  /></div>
         <div class="text">MyDiaryApp</div><br/><br/>
         <div class="line"></div>
         <div class="welcome">welcome ${user.username}</div>
         <div class="signout"><a href="/signout"><button type="button">signout</button></a></div><br/><br/><br/>
         <div class="entries">List of past entries</div>
         <div class="add"><a href="addEntry"><button type="button">Add Entry</button></a></div>
		 <br/><br/><br/>
		 <table border="1px solid black" width="97%" style="text-align: center;margin-left: 8px;">
			<tr><th>Date</th><th colspan="3">Action</th></tr>
			<c:if test="${entrieslist.size() == 0}">
				<tr><td colspan="3"> User has no past Entries</td></tr>
			</c:if>
		 <c:forEach items="${entrieslist}" var="e">
			 <tr><td><fmt:formatDate value="${e.entrydate}" pattern="dd-MM-yyyy" /></td>
			   <td><a href="/viewEntry?id=${e.entryid}">view</a></td>
			   <td><a href="/updateEntry?id=${e.entryid}">update</a></td>
			   <td><a href="/deleteEntry?id=${e.entryid}">delete</a></td>
			</tr>
		   
		 </c:forEach>
		 </table>
		 
       </div>

</body>
</html>