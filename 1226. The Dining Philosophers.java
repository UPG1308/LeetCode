class DiningPhilosophers {

	private Integer[] forks	= new Integer[] {0, 0, 0, 0, 0};

	public DiningPhilosophers( ) {

	}

	public void wantsToEat( int philosopher, Runnable pickLeftFork, Runnable pickRightFork, Runnable eat, Runnable putLeftFork, Runnable putRightFork ) throws InterruptedException {
       
        int leftIndex = philosopher;
		int rightIndex = philosopher == 0 ? 4 : philosopher - 1;

		synchronized ( forks[ leftIndex ]  ) {

			pickLeftFork.run( );
            
			synchronized ( forks[ rightIndex ] ) {
                    
				pickRightFork.run( );
				eat.run( );
				putLeftFork.run( );
				putRightFork.run( );

			}
		}
    }
}
