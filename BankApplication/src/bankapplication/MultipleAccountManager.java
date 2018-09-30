/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.util.ArrayList;

/**
 *
 * @author dev
 */
public class MultipleAccountManager {
    
    ArrayList<BankAccount> arrayList;

    public MultipleAccountManager() {
        arrayList=new ArrayList<>();
    }

    public void getAccountDetails(String acc){
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i).getaccountno().equals(acc)){
                System.out.println("\nName : "+arrayList.get(i).getName()+"\naccount no. : "+arrayList.get(i).getaccountno()+"\nbalance : "+arrayList.get(i).getBalance());
                return;
            }
        }
        System.out.println("no account found ...");
    }
    public ArrayList<BankAccount> getAccountByName(String name){
        ArrayList<BankAccount> temp=new ArrayList<>();
        for(int i=0;i<arrayList.size();++i){
            if(arrayList.get(i).getName().equals(name)){
                temp.add(arrayList.get(i));
            }
        }
        if(arrayList.size()>0){
            return temp;
        }
        else{
            return null;
        }
    }
    public void withdrawFromAccount(String acc,float amt){
        BankAccount temp=null;
        for(int i=0;i<arrayList.size();++i){
            if(arrayList.get(i).getaccountno().equals(acc)){
                temp=arrayList.get(i);
            }
        }
        if(temp==null){
            System.out.println("no account found ");
        }
        else{
            temp.withdraw(amt);
        }
    }
    public void displayAll(){
        for(int i=0;i<arrayList.size();++i){
            System.out.println("\nName : "+arrayList.get(i).getName()+"\naccount no. : "+arrayList.get(i).getaccountno()+"\nbalance : "+arrayList.get(i).getBalance());
        }
    }
    public void addToAccount(String acc,float amt){
        BankAccount temp=null;
        for(int i=0;i<arrayList.size();++i){
            if(arrayList.get(i).getaccountno().equals(acc)){
                temp=arrayList.get(i);
            }
        }
        if(temp==null){
            System.out.println("no account found ");
        }
        else{
            temp.deposit(amt);
        }
    }
   
    public BankAccount getAccountByAccountNo(String acc){
        int flag=0;
        BankAccount temp=new BankAccount();
        for(int i=0;i<arrayList.size();++i){
            if(arrayList.get(i).getaccountno().equals(acc)){
                flag=1;
                temp=arrayList.get(i);
            }
        }
        if(flag==1){
            return temp;
        }
        else{
            return null;
        }
    }
    public void addAccount(String name,float balance){
        BankAccount temp=new BankAccount(balance,name);
        arrayList.add(temp);
    }
    public ArrayList<BankAccount> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<BankAccount> arrayList) {
        this.arrayList = arrayList;
    }
    
}
