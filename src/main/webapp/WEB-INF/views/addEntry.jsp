<%@ taglib prefix="c" uri="jakarta.tags.core" %>


<!DOCTYPE html>
 <head>
  <link  rel="stylesheet" href="css/stylenew3.css" />
</head>
    <body class="page">
         <div class="smallimage"><img src="images/smallbook3.png"  /></div>
         <div class="text">MyDiaryApp</div><br/><br/>
         <div class="line"></div>
		 <div class="welcome">welcome ${users.username}</div>
		 <div class="signout"><a href="/signout"><button type="button">signout</button></a></div>
         <div class="bigbook"><img src="images/smallbook1.png"  /></div>
          <div class="form">
			    <form  action="./saveentry" method="post">
                <h3 style="text-align:center;">Add Entry</h3>
              <label>Date : </label>   <input type="date" name="entrydate"/>   <br/><br/>      
              <label>Description : </label>   <textarea  rows="5" cols="10" name="description"></textarea> <br/><br/> 
			  <input type="hidden" name="userid" value="${users.id}" />  
              <button type="submit" class="button">SaveEntry</button><br/>
			  
			  </form>
			 
       </div>

</body>
</html>