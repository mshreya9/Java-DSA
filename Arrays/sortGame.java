/*
You are supposed to arrange the given list (list of employees with their salaries) in such a manner that the list is sorted in decreasing order of salary. 
And if two employees have the same salary, they should be arranged in lexicographical manner such that the list contains only names of those employees having salary greater than or equal to a given number x.
*/

import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
		int q = sc.nextInt(); //number of employees
		Employee[] arrOfObj = new Employee[q];
		//input array of objects
		for(int i = 0; i < q; i++){
            String name = sc.next();
			//sc.next();
            int salary = sc.nextInt();
            arrOfObj[i] = new Employee(name, salary);
		}
		//main logic for the question
		//System.out.println(arrOfObj[0].name);
		Arrays.sort(arrOfObj);
		for(int i = 0; i < q; i++){
			if(arrOfObj[i].salary >= x){
				System.out.println(arrOfObj[i].name + " " + arrOfObj[i].salary);
			}
		}
    }
}

//creating Employee class
class Employee implements Comparable<Employee> {
	String name;
	int salary;

	Employee(String name, int salary){
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		if (this.salary == o.salary) {
			return this.name.compareTo(o.name);
		}
		return o.salary - this.salary;
	}
}

/*
Sample Input
79
4
Eve 78
Bob 99
Suzy 86
Alice 86

Sample Output
Bob 99
Alice 86
Suzy 86
*/