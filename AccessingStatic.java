class AccessingStatic{

   public static void main(String[] args){
      System.out.println("Accessing the static variable : "+Static_NormalVAriables.a);
       Static_NormalVAriables  acc = new Static_NormalVAriables ();
     System.out.println("normal variable calling using obj refence : "+acc.name);
}
}