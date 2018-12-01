/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testy;

import static java.lang.Math.pow;

/**
 *
 * @author Sławomir
 */
public class Testy {
    private int Binary[];
    private int piksels[][];
    int i,j,k,l,m,n,p,x,s ,z;
    public char Data[];
     
    String text1,wiadm="";
    public Testy(){}
    public void Zapisz()
            
    {
        System.out.println("1|1= "+(1|1));
                               System.out.println("1|0  "+(1|0));
                                System.out.println("1&~0  = "+(1&~0));
                                 System.out.println("1&~1=  "+(1&0));
     piksels = new int[20][20];
        for( i=0;i<20;i++)
                       {
                           for(int h=0;h<20;h++)
                           {
                              System.out.print( piksels[i][h]=1);
                              
                           }
       System.out.println("   to jest dobrze");
    }
        
    }
     public void Bin(){
    text1="kotek#";
           int length=text1.length();
           Data=new char[length];
           int text3, g=0;
       
           Data=text1.toCharArray();
             
           
           int length1=length*8 ;
           Binary=new int[length1];
           
           for (int j=0;j<length;j++)
           {
              int liczba=(int)Data[j];
              System.out.println(liczba);
              int p=0;
                 
           for(int i=0;i<8;i++)
           {
               
               if(liczba%2==0) k=0;
               else  k=1;
               liczba=liczba/2;
               Binary[g]=k;
               System.out.println( g+" "+k);
              
              if(g<Binary.length) g++;
           }
               System.out.println("j wynosi= "+ j);
           }}
     public void Zapisz_d()
     {
      p=0;
      x=0 ;
        for(int i=0;i<20  ;i++)
        {
           for( j=0;j<20  ;j++)
           {
                 int change=0;
               for(int k=0;k<4;k++)
               {
                   if(x<Binary.length)
                           {
                    z=Binary[x];
           System.out.println( "Wart z tab wynosi z "+z+"  x="+x);
                   if (k==0) 
                   {  change=1;}
                       else
                       if(k==1){ change=256;}
                           else
                           if(k==2) { change=65536; }
                               else
                               if(k==3) {change=16777216;  }
                   System.out.println("KKK= "+k);
               if(z==0)
               {
                  System.out.println("To jest 0  ");
                  piksels[i][j]=piksels[i][j] &~change;
                  int c=piksels[i][j];
                  System.out.println(c);
               }
               else if(z==1)
                     
                     {
                         System.out.println("to jest 1  ");
                         piksels[i][j]=piksels[i][j] | change;
                         System.out.println(piksels[i][j]);
                     }
                //p++;
                //if(p==8)
                
               // { p=0;}
                        x++;
                           }
                   
                 // x++; else x=Binary.length-1;  
                }
        }
           
        }
                for(i=0;i<20;i++)
                {
                    for(j=0;j<20;j++)
                    {
                       System.out.print( piksels[i][j]+" ");
                    }
                    System.out.println("");
                }
     }
       public void OdczytLSB()
              {
                  int p=0,x=0 ,td;
        for(int i=0;i<20;i++)
        {
           for(int j=0;j<20 ;j++) 
           {
               int change=0;
               for(int k=0;k<4;k++)
               {
                   if(k==0) {  change=1;}
                       else
                       if(k==1){ change=256;}
                           else
                           if(k==2) { change=65536; }
                               else
                               if(k==3) {change=16777216;  }
                   
               
               
               if(((piksels[i][j] & change)==1 )|| ((piksels[i][j] & change)==256) ||
                       ((piksels[i][j] & change)==65536) ||
               ((piksels[i][j] & change)==16777216))
               
               {
                   wiadm=wiadm+"1";
               }
               else 
               {
                     wiadm=wiadm+"0"; 
               }
         
           
               
    }}
        
                   
              }
        System.out.println("Odkodowany text to : "+ wiadm);
              }
       
    @SuppressWarnings("empty-statement")
               public void Wypisz_tab()
       {
          
             System.out.println( wiadm.substring(0 , 8));            
             System.out.println( wiadm.substring(8, 16));
             System.out.println( wiadm.substring(16, 24));
             System.out.println( (wiadm.substring(24, 32)));
             System.out.println( wiadm.substring(32, 40));
             System.out.println( wiadm.substring(40, 48));
             System.out.println( (wiadm.substring(48, 56)));
       }
               
      
          public void Wypisz_text()
          {
              String licz="";
              int ile = 0,t=0,l = 0, ile2=0;
              int g=0;
              int znak=0;
         char  tabela [] = new char[wiadm.length()];
         tabela=wiadm.toCharArray();
        
         
         for(int j=0;j<(((wiadm.length())/8)-1);j++)
         {
              i=0;t=0; l=0;
           for(int i=0;i<8 ;i++)
           {
               
               System.out.println(tabela[g]);
                System.out.println("inttt  "+(int)tabela[g]);
               ile2=(int)tabela[g];
               // licz=licz+(tabela[g]);
              // if(ile2==48 & (i+1)%8==0)k=0; else if(ile2==49 & (i+1)%8==0)       k=1;
                if(ile2==48) 
                {ile=0;}
                else if(ile2==49) {ile=1; }
               System.out.println(" ile= "+ile);
               
              
                l=l+(int)(ile*pow(2 ,i));
                //System.out.println("i= "+)
               System.out.println("Dla i= "+i+   "  l = "+ l);
               //if((i+1)%8==0)
               //System.out.println("znak "+(char)l);
                //System.out.eprintln("I="+i+"  ile= "+ile+" ile2=  "+ile2+" g= "+g);
                
                if((i)%7==0){
                   // System.out.println("t = "+(char)(l));
                   
                  licz=licz+((char)(l+k));
                  
                
                }
                if(i==7& ((l+k)==35))
                    j=((wiadm.length()/8)-1);
                else
                g++;
         }
                
           }
           
             
              

         System.out.println("Od text to "+ licz);
          }


     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Testy  test= new Testy();
       
       test.Zapisz();
       test .Bin();
       test.Zapisz_d();
       test.OdczytLSB();
       test.Wypisz_text();
       test.Wypisz_tab();
    }
    
} 
