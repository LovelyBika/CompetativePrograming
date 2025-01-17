import React from 'react'
import { useState } from 'react'

function Press() {
   const [color,setColor]=useState("white");
   return(
    <div className="w-full h-screen duration-200"
    style={{backgroundColor:color}}>
        <div className="fixed flex flex-wrap
        justify-center bottom-12 inset-x-0 px-2">
         <div className='flex flex-wrap justify-center gap-3
         shadow-lg bg-white px-3 py-2 rounded-3xl'>
            <button className="outline-none px-4 py-1
            rounded-full text-white shadow-lg"
              style={{backgroundColor:"red"}}
            onClick={()=>{setColor("red")}}>Red</button>
            
            <button className="outline-none px-4 py-1
            rounded-full text-white shadow-lg"
              style={{backgroundColor:"green"}}
            onClick={()=>{setColor("green")}}>Green</button>
            
            <button className="outline-none px-4 py-1
            rounded-full text-white shadow-lg"
              style={{backgroundColor:"blue"}}
            onClick={()=>{setColor("blue")}}>blue</button>

<button className="outline-none px-4 py-1
            rounded-full text-white shadow-lg"
              style={{backgroundColor:"grey"}}
            onClick={()=>{setColor("grey")}}>grey</button>

<button className="outline-none px-4 py-1
            rounded-full text-white shadow-lg"
              style={{backgroundColor:"pink",
                      text:""}}
            onClick={()=>{setColor("pink")}}>pink</button>

<button className="outline-none px-4 py-1
            rounded-full text-white shadow-lg"
              style={{backgroundColor:"black"}}
            onClick={()=>{setColor("black")}}>black</button>
            
         </div>
        </div>

    </div>
   );
}

export default Press