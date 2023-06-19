# Programme by 25512 Lovely
import random

articles =("A","The")
nouns   = ("Boy","Girl","Bat","Ball")
verbs =("hit","saw","liked")
prepostions=("with","by")

def sentence():                                               
    return nounphrase() + " " + verbphrase()

def nounphrase():
    return random.choice(articles)+ " " + random.choice(nouns) 

def verbphrase():
    return random.choice(verbs)+ " " + nounphrase() + " " +  prepositionalphrase()

def prepositionalphrase():
    return random.choice(prepostions) +" " +nounphrase()

def main():                                                    
    number = int(input("Enter the no. of sentences: "))       

    for count in range(number):
        print(sentence())

main()   #Excution of programme