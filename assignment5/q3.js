function isValid(s){
    const stack = []

    for (i=0; i < s.length; i++){

        let curr = s[i];

        switch(curr) {
            case '(': stack.push(')');
                break;
            case '[': stack.push(']');
                break;
            case '{': stack.push('}')
                break;
            default:
                var top = stack.pop()
                console.log(top)
                if (curr!== top) return "invalid";       
        }
        console.log(stack)
    }
    if ( stack.length === 0){
        return "valid";
    }
    else{
        return "invalid"
    }
}
string =prompt("Enter the Brackets");
var validity=isValid(string)
document.getElementById("message").innerHTML=validity;
