from importlib.resources import contents
import requests 
from bs4 import BeautifulSoup

url="http://codewithharry.com"

r=requests.get(url)
htmlContent =r.content 


soup =BeautifulSoup(htmlContent,'html.parser')
print(soup.prettify)