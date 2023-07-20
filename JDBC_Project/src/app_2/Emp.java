package app_2;

import java.util.Objects;

public class Emp implements Comparable<Emp> {
		private int empno;
		private String ename;
		private int deptno;
		private float sal;
		public Emp(int empno, String ename, int deptno, float sal) {
			super();
			this.empno = empno;
			this.ename = ename;
			this.deptno = deptno;
			this.sal = sal;
		}
		public int getEmpno() {
			return empno;
		}
		public void setEmpno(int empno) {
			this.empno = empno;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		public float getSal() {
			return sal;
		}
		public void setSal(float sal) {
			this.sal = sal;
		}
		@Override
		public String toString() {
			return "Emp [empno=" + empno + ", ename=" + ename + ", deptno=" + deptno + ", sal=" + sal + "]";
		}
		@Override
		public int hashCode() {
			return deptno;
		}
		
		public boolean equals(Emp obj) {
			if(this.deptno==obj.deptno)
				return true;
			else
				return false;
		
		}
		@Override
		public int compareTo(Emp o) {
			if(this.ename.compareToIgnoreCase(o.ename)>0)
				return 1;
			else if(this.ename.compareToIgnoreCase(o.ename)<0)
				return -1;
			else
				return 0;
			
			
		}
			

}
