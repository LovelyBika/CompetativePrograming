import { useState,useCallback, useEffect,useRef } from 'react'

import './App.css'

function App() {
 const [length,setLength]=useState(8)
 const [numberAllow,setNumber]=useState(false)
 const [charcterAllow,setCharacter]=useState(false)
 const [password,setPassword]=useState("")
const passwordRef =useRef(null)

 const PassGenerator =useCallback(()=>{
  let pass=""
  let str="ABCDEFGHIGKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
 if(numberAllow) str+="0123456789";
 if(charcterAllow) str+="@$%^&*(){}<>.~`";
for(let i=1;i<=length;i++){
  let char=Math.floor(Math.random()*str.length+1)
  pass+=str.charAt(char)
}
setPassword(pass)
 },[length,numberAllow,charcterAllow,setPassword])

 const copyPasswordToClipboard = useCallback(()=>
{
window.navigator.clipboard.writeText(password)
},
  [password])
 useEffect(()=>{
  PassGenerator()
 },[length,charcterAllow,numberAllow,PassGenerator]
)
  return (
    <>
    <div className=' w-full max-w-md
    mx-auto shadow-md rounded-lg px-4 py-3 my-8 text-orange-500
    bg-gray-800'>
     <h1 className='text-white text-center my-3'>Password Generator</h1>
    <div className='flex shadow rounded-lg
    overflow-hidden mb-4'>
      <input type="text"
      placeholder='Password'
      value={password}
      className='outline-none w-full py-1 px-3'
      readOnly
      ref={passwordRef}
       />
      <button
      className='outline-none
      bg-blue-700
      text-white
      px-3 py-0.5 shrink-0'
      onClick={copyPasswordToClipboard}>Copy</button>
    </div>
    
    <div className='flex text-sm gap-x-2'>
      <div className='flex items-center gap-x-1'>
       <input type="range"
       min={6}
       max={100}
       value={length}
       className='cursor-pointer'
       onChange={(e)=>(setLength(e.target.value))}
        />
        <label >Length:{length}</label>
        <input type="checkbox"
          defaultChecked={numberAllow}
          onChange={()=>{
            setNumber((prev)=>
            !prev)
          }}
         />
         <label >Numbers</label>
         <input type="checkbox" 
         defaultChecked={charcterAllow}
          onChange={()=>{
          setCharacter((prev)=>
          !prev)}} />
         <label >Characters</label>
      </div>
    </div>
    </div>
    </>
  )
}

export default App
