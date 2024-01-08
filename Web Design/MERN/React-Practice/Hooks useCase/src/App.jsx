import { useState } from 'react'

import './App.css'

function App() {
  let [counter, setCount] = useState(15)
 
  const  addValue=()=>{
  if(counter<=20){   
    if(counter==20){
      document.getElementById("h1Content").innerHTML=`Max item this Cart can Hold ${counter}`;
    }
   else{   
  counter=counter+1;
  setCount(counter);
   document.getElementById("h1Content").innerHTML=`Item got Added to cart as ${counter}`;
  }
}
  }
  const removeValue=()=>{
    if(counter==0){
      setCount(0);
      document.getElementById("h1Content").innerHTML=`Card is Empty now as:  ${counter}`;
    }
     else{
    setCount(counter--);
    document.getElementById("h1Content").innerHTML=`After Item got removed value of Cart is: ${counter}`;
     }
  }
  return (
    <>
      <h1 id="h1Content">Click Button to Add Value in Cart</h1>
      <h2>value:{counter}</h2>
      <button  onClick={addValue}>
       Add Value {counter}
      </button>
      <br></br>
      <br />
      <button onClick={removeValue}> Remove Value {counter}</button>
    </>
  )
}

export default App
