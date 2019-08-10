# cryptography
Course material for Cryptography class at Coursera.org from University of Maryland

### Lesson 1

Ciphers - algorithms used in cryptography

Shifted Cipher - convert the input text into ascii numbers and then shift them by a given key to get encrypted text. The key is a number

Vigenere's cipher (pronounced as Visionaire's) - Similar to Shifted but the key is a string of any length. 
The ascii numbers of string are added to the ascii numbers of input to get encrypted text.

Shifted Cipher can be broken by using brute-force approach.

Vigenere's Cipher cannot be broken by brute-force as the key space is 14^26 for a 14 char key.
We use clever techniques (e.g. 'e' is the most frequently used char in English text)
