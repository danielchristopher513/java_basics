class Student(var rollno: Int, var name: String) {
    override fun toString(): String {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}'
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val st = Student(123, "dan")
            println(st)
        }
    }
}
