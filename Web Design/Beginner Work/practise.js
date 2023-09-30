function validate()
{  var name,email,number,cardName,cardNo,cvv;
    name = document.getElementById("name").value;
   
    email=document.getElementById("email").value;
    number=document.getElementById("number").value;
    cardName=document.getElementById("cardName").value;
    cardNo=document.getElementById("cardNo").value;
    cvv=document.getElementById("cvv").value;


   if(name==""|| cardNo==""|| cardName==""|| number==""|| cvv==""){
    alert("please fill all the details");
   }
   else if(cardNo<7){
     alert("length of card no is small ");

   }
   else if(number<10){
    alert("Mobile no is less than 10");
   }
   else if(cvv>3)
     {alert("length of cvv is more than 3");}

    else
   { alert("Sucess");}
}