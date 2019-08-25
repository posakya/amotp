      # amotp
      
	      Step 1. Add the JitPack repository to your build file

	      Add it in your root build.gradle at the end of repositories:

		    allprojects {
			  repositories {
				...
				maven { url 'https://www.jitpack.io' }
			  }
		    }
		    
		    
	    
	    
	      Step 2. Add the dependency

		dependencies {
			implementation 'com.github.posakya:amotp:0.1'
		}
		
		
		

	      public class MainActivity extends AppCompatActivity {

		  String x1 = "12";
		  String x2 = "100";

		  @Override
		  protected void onCreate(Bundle savedInstanceState) {
		      super.onCreate(savedInstanceState);
		      setContentView(R.layout.activity_main);

		      System.out.println(Calculate.doCalcualtion(Operator.SUBTRACTION,x1,x2));

		  }
	      }
