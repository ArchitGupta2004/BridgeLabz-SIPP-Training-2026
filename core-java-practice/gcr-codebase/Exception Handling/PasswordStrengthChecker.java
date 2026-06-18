public class PasswordStrengthChecker{
public static void checkPassword(String password){
try{
if(password==null) throw new IllegalArgumentException("Password cannot be null.");
if(password.isEmpty()) throw new IllegalArgumentException("Password cannot be empty.");
if(password.length()<8) throw new IllegalArgumentException("Password must be at least 8 characters long.");
if(!Character.isUpperCase(password.charAt(0))) throw new IllegalArgumentException("First character must be uppercase.");
if(!Character.isDigit(password.charAt(password.length()-1))) throw new IllegalArgumentException("Last character must be a digit.");
boolean hasSpecial=false;
for(char c:password.toCharArray()){
if("@#$%&*".indexOf(c)!=-1){
hasSpecial=true;
break;
}
}
if(!hasSpecial) throw new IllegalArgumentException("Password must contain at least one special character (@, #, $, %, &, *).");
System.out.println("Password '"+password+"' is valid.");
}catch(IllegalArgumentException e){
System.out.println("Exception: "+e.getMessage());
}
}
public static void main(String[] args){
checkPassword(null);
checkPassword("");
checkPassword("short");
checkPassword("lower123");
checkPassword("Upper12a");
checkPassword("UpperNoSpecial123");
checkPassword("Valid@Pass123");
}
}
