public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    public double tax(){
        double tax=0;

        if (this.salary>1000){
            tax=this.salary*0.03;
        }

        return tax;
    }
    public int bonus(){
        int bonus=0;

        if (this.workHours>40){
            bonus=(this.workHours-40)*30;
        }

        return bonus;
    }

    public double raiseSalary(){
        double raised=0;
        int todayYear=2021;

        if (todayYear-this.hireYear<10){
            raised=this.salary*0.05;
        }
        else if (todayYear-this.hireYear<20){
            raised=this.salary*0.1;
        }
        else {
            raised=this.salary*0.15;
        }

        return raised;
    }

    public double totalSalary(){
        this.salary=this.salary+raiseSalary();
        return salary;
    }

    @Override
    public String toString(){
        return "Adı:"+ this.name+"\nMaaşı: "+this.salary+"\nÇalışma saati: "+this.workHours+
                "\nBaşlangıç yılı: "+this.hireYear+"\nVergi: "+tax()+"\nBonus: "+bonus()+
                "\nMaaş artışı: "+raiseSalary()+"\nVergi ve bonuslar ile birlikte maaş="+
                (this.salary-tax()+bonus())+ "\nYeni Maaş: "+totalSalary();
    }

}
