import React from 'react'
import {Routes,Route} from "react-router-dom";
export const Router=()=>{
    return(
        <>
        <Routes>
        <Route path="/login" element={<Login/>} />

        </Routes>
        </>
    )
}