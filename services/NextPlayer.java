package services;



public class NextPlayer {


	gGame = new gGamer<Void, Model>() {
		@Override
		protected Void doInBackground() throws InterruptedException {
		gameLoopRunning = true;
		while (gameLoopRunning) {

		    Thread.sleep(1000);


		    if (model.getActivePlayer().isUserControlled()) {

		        boolean userRolled = false;
		        while(!userRolled) {
		            System.out.println("Rikse to zari..");
		            Thread.sleep(3000);
		        }

		    }
		    
		    else {
		
		        model.rollDice();
		    }

		    publish(model);

		    Thread.sleep(1000);
		    model.incrementPlayerTurn();
		    publish(model);

		}
		return null;
		}

		@Override
		protected void process(List<Model> chunks) {
		Model gameModel = chunks.get(chunks.size() - 1);
		//osous paiktes thelw
		for (int i = 0; i < 6; i++) {
		    view.getPlayerPanel(i).setTurn(gameModel.getPlayers().get(i).isTurn());
		}
		view.getGamePanel().getDice().setDie1(model.getDie1());
		view.getGamePanel().getDice().setDie2(model.getDie2());
		}

		};
		gGame.execute();
