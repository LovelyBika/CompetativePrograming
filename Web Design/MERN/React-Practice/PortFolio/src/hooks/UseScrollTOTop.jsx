import { useEffect ,useState} from "react";
import {FiChevronUp} from 'react-icons/fi'

 const UseScrolltoTOP=()=>{
   const [showScroll,setShowScroll]=useState(false);

   useEffect(()=>{
    window.addEventListener('scroll',scrollToTop)
    return function cleanUp(){
        window.removeEventListener('scroll',scrollToTop);
    };
   });
   const scrollToTop =()=>{
    if(!showScroll && window.pageXOffset>400)
      setShowScroll(true);
    else if(showScroll && window.pageXOffset<400)
        setShowScroll(false)
   };

  const backToToP=()=>{
    window.scrollTo({
        top:0,
        behavior:'smooth'
    })
    };
   window.addEventListener('scroll',scrollToTop);
   return (
    <>
    <FiChevronUp
    className="scrollToTop"
    onClick={backToToP}
    style={{
        height:45,
        width:45,
        borderRadius: 50,
        right:50,
        bottom :50,
        display: showScroll ? 'flex' : 'none',
        padding :5,

    }}
    />

    
    </>
   )
  }
  export default UseScrolltoTOP;
