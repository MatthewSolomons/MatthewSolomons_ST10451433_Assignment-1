package com.example.assigment1

importTextView



class MainActivity() : AppCompatActivity(), Parcelable {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textInput = findViewById<TextView>(R.id.textInput)

        clickMeButton?  setOnClickListenerrun {}

val textInput = findViewById<EditText>(R.id.textInput)
        val clickMeButton = findViewById<Button>(R.Id.clickMeButton)
        val textView = findViewById<TextView>(R.id.textview)

        clickMeButton.setOnClickListener {
            //Initialize message with a default  value
            var message : ""

        }

        val text: Int = text.Input.text.toString().toIntorNull () ?: 0 //convert

    if (text >= 0 && text <=9{
        message = "Adolf Hitler"
        }
    else if ( text >= 10 && text <=19){
        message = "Nelson Mandela"

    }    }

    //set the message to the textview
textView.text = message
