void traversal(Node root)
{
String pre="",in="",post="";
Stack<Pair> stack = new Stack<>();
stack.push(new Pair(root,1));
while(!stack.isEmpty())
{
Pair p = stack.peek();
if(p.val==1)
{
pre = pre+p.data+" ";
p.val++;
if(p.node.left!=null)
stack.push(new Pair(p.node.left,1);
}
else if(p.val==2)
{
in = in+p.data+" ";
p.val++;
if(p.node.right!=null)
stack.push(new Pair(p.node.right,1));
}
else
{
post = post+p.data+" ";
stack.pop();
}
}
System.out.println(pre);
System.out.println(in);
System.out.println(post);
}
class Pair
{
Node node;
int val;
public Pair(Node node,int val)
{
this.node=node;
this.val=val;
}
}
