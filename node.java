public class node {
    // private Student student; // the data part of the node
    // private SNode   next;    // a link to the next student int the linked list
    private double data;
    private node prev;
    private node next;

    public node ( double d, node p, node n ) {
		data = d;
        prev = p;
		next = n;
	}

    // public node() {
    //     this(null, null, null);
    // }

    public double getData(){
        return data;
    }
    public node getPrev(){
        return prev;
    }
    public node getNext(){
        return next;
    }
    public void setNext(node n){
        next = n;
    }
    public void setPrev(node p){
        prev = p;
    }
    public void setData(double d){
        data = d;
    }
    // public Student getStudent () { return student; }
    // public void setStudent (Student s) { student = s; }

    // public SNode getNext () { return next; }
    // public void setNext (SNode n) { next = n; }
}