/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ats60
 */
public class Grade {
    private int total;
    private int earned;
    
public Grade(int earned, int total){
    this.total = total;
    this.earned = earned;
}
public int getTotal(){
    return total;
}
public void setTotal(int total){
    this.total = total;
}
public int getEarned(){
    return earned;
}
public void setEarned(int total){
    this.earned = earned;
}

public double getPercentage(){
    return (earned/1.0)/total*100;
}
public char letterGrade(){
         double percentGrade = getPercentage();
         if (percentGrade < 60) {
             return 'F';
         } else {
             if (percentGrade < 70){
                 return 'D';
             } else {
                 if (percentGrade < 80){
                     return 'C';
                 } else {
                     if (percentGrade < 90){
                         return 'B';
                     } else {
                       
                             return 'A';
                         
                     }
                 }
             }
         }
}
}