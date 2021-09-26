import 'dart:ui';
import 'package:flutter/material.dart';

/// This is the stateful widget that the main application instantiates.
class MyStatefulWidget extends StatefulWidget {
  const MyStatefulWidget({Key? key}) : super(key: key);

  @override
  State<MyStatefulWidget> createState() => _MyStatefulWidgetState();
}

/// This is the private State class that goes with MyStatefulWidget.
class _MyStatefulWidgetState extends State<MyStatefulWidget> {
  final GlobalKey<FormState> _formKey = GlobalKey<FormState>();

  @override
  Widget build(BuildContext context) {
    return Form(
      key: _formKey,
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          TextFormField(
            decoration: const InputDecoration(
                hintText: 'Enter your name', alignLabelWithHint: true),
            validator: (String? value) {
              if (value == null || value.isEmpty) {
                return 'Please enter some text';
              }
              return null;
            },
          ),
          TextFormField(
            decoration: const InputDecoration(
                hintText: 'Enter your name', alignLabelWithHint: true),
            validator: (String? value) {
              if (value == null || value.isEmpty) {
                return 'Please enter some text';
              }
              return null;
            },
          ),
          Center(
            child: Padding(
              padding: const EdgeInsets.symmetric(vertical: 16.0),
              child: ElevatedButton(
                onPressed: () {
                  // Validate will return true if the form is valid, or false if
                  // the form is invalid.
                  if (_formKey.currentState!.validate()) {
                    // Process data.
                  }
                },
                child: const Text('Sign In'),
              ),
            ),
          ),
        ],
      ),
    );
  }
}

class loginpage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: ListView(
          children: <Widget>[
            Center(
              child: Image.network(
                'https://www.dpreview.com/files/p/articles/4698742202/facebook.jpeg',
                height: 450,
                width: 450,
                alignment: Alignment.topRight,
              ),
            ),
            const MyStatefulWidget(),
            Center(
              child: TextButton(
                onPressed: () {
                  Navigator.pop(context);
                },
                child: Text('Go Back'),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
