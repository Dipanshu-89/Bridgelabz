class JobDemo {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Job running...");
        new Thread(job).start();
    }
}

