function checkPalindrome(string) {

    const len = string.length;
    
    
    for (let i = 0; i < len / 2; i++) {
    
    
        if (string[i] !== string[len - 1 - i]) {
            console.log("Not Pallindrome");
        }
    }
    console.log("Pallindrome");
    }
    
    const string = "madam"
    
    const value = checkPalindrome(string);
    
    console.log(value);