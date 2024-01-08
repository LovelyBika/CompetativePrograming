import React, { Suspense, lazy } from "react";
import { AnimatePresence } from "framer-motion";
import Header from "./components/Header.jsx";
import Footer from "./components/Footer.jsx";
import ScrolltoTop from "./components/ScrollToTop.jsx";
import { BrowserRouter as Router,Route,Routes } from "react-router-dom";
import UseScrollTOTop from "./hooks/UseScrollTOTop.jsx";

const Home = lazy(()=>import('./components/Home.jsx'))
const About =lazy(()=>import('./components/About.jsx'))
const Contact =lazy(()=>import('./components/Contact.jsx'))

 function App(){
    return (
       
      
        <AnimatePresence>
            <div className=" bg-secondary-light dark:bg-primary-dark transition duration-300">
                <Router>
                    <ScrolltoTop/>
                    <Header/>
                    <Suspense fallback={" "}>
                        <Routes>
                            <Route path="/" element={<Home/>}/>
                            <Route path="about" element={<About/>}/>
                            <Route path="contact" element={<Contact/>}/>
                        </Routes>
                    </Suspense>
                    <Footer/>
                    
                </Router>
                <UseScrollTOTop/>
            </div>
        </AnimatePresence>
       
    )
}

export default App