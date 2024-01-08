// import React from 'react';


// function newsApp(){
// return (
//     <>
//     <div className="contaain my-3">
//         <button>Fetch News</button>
//     </div>
    
    
//     </>
// )
// }

// export default newsApp;


function Createtag()    {
    // var age =prompt("How old are You")
    var element= document.createElement('h3');
  element.textContent=performance.now()
  document.body.appendChild(element)
 
//   alert("App");
}

// Genertor Fumction
function* Gen(){
    console.log("ok");
    try{yield 1;
    //    console.log("yield1");
    yield 2;
    // console.log('yield2');
    yield 3;
    // console.log('yield3');
}
catch(e){
    console.log(e.message)
}
}
// var genorartor= Gen()
// genorartor.next();
// genorartor.next();
// genorartor.throw(new Error("Error!"));

// genorartor.next();

