class Checkargs{
public static void main(String[] args){
if(args.length!=0){
if(args[0].equals(args[1])){
System.out.println(args[1]+" "+args[0]);
}
else{
System.out.println(args[0]+" "+args[1]);

}
}
}
}