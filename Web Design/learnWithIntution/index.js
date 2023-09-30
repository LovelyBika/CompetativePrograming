
function changeStyle(styleId){
    var linkElement= document.getElementsByTagName("link");
    for(var i=0;i<linkElement.length;i++){
        linkElement[i].disabled=true;
    }
    document.getElementById(styleId).disabled=false;
   
}