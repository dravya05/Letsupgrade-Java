public class Game {

    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Who is father of evolution?","What is the closest planet to sun?","What is the capital of canada?"};
    String[] options1={"thomas edison","Earth","toronto"};
    String[] options2={"charles darwin","Venus","montreal"};
    String[] options3={"plato","Mercury","winnipeg"};
    String[] options4={"ferdinand de magellan","Jupiter","ottawa"};
    int[] answers={2,3,4};


    public void initGame()
    {
//        created three objects
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }
//        applying values to the variables of the object
//        questions[0].question="Who is the Strongest Avenger?";
//        questions[0].option1="";
//        questions[0].option2="charles darwin";
//        questions[0].option3="plato";
//        questions[0].option4="ferdinand de magellan";
//        questions[0].correctAnswer=2;
//
//        questions[1].question="";
//        questions[1].option1="Earth";
//        questions[1].option2="Venus";
//        questions[1].option3="Mercury";
//        questions[1].option4="Jupiter";
//        questions[1].correctAnswer=3;
//
//        questions[2].question="";
//        questions[2].option1="";
//        questions[2].option2="montreal";
//        questions[2].option3="winnipeg";
//        questions[2].option4="ottawa";
//        questions[2].correctAnswer=4;

        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
        questions[i].option1=options1[i];
        questions[i].option2=options2[i];
        questions[i].option3=options3[i];
        questions[i].option4=options4[i];
        questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

          player.getDetails();
          for(int i=0;i<3;i++)
          {
              boolean status=questions[i].askQuestion();
              if(status==true)
              {
                  System.out.println("Bahot hi unda khele hai aap!!");
                  player.score=player.score+5;
              }
              else{
                  System.out.println("Maaf karna mai aapki sahyata nahi kar sakta");
                  player.score=player.score-5;
              }
          }

        System.out.println(player.name+" your score is "+player.score);

    }

}