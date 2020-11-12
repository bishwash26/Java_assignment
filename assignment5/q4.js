
height =prompt("Enter the Height of tree");
var a =0;
function leafs(x){
var left=x;
var right=x;
var tree = "";
for(var i = 1; i <= x; i++) {
    while (left>0)
    {
        for (var i=0;i<left;i++)
        {
            tree=tree+"&nbsp";
        }
        for (var i=left;i<=right;i++)
        {
            if (left==right)
            {
            tree=tree+"*";
            }
            else{
                tree=tree+"0";
            }
        }
        left=left-1;
        right;
        tree=tree+"<br>";
    }
    }
    document.getElementById("message").innerHTML=tree;
}


if(height!=0){
    leafs(height)
}
else{
    console.log("Invalid input such tree cannot be formed");
}