public class User {
    private String username;
    private Task[] taskArray=new Task[10];

    public User(String username)
    {
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Task[] getTaskArray() {
        return taskArray;
    }

    public void setTaskArray(Task[] taskArray) {
        this.taskArray = taskArray;
    }
}
