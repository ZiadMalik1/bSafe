import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:bsafe/loginpage.dart';
import 'package:flutter/material.dart';

void main() => runApp(MaterialApp(
      home: HomePage(),
    ));

class HomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: ListView(
          children: <Widget>[
            Container(
              child: Image.network(
                'https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Facebook_f_logo_(2019).svg/1280px-Facebook_f_logo_(2019).svg.png',
                height: 35,
                width: 35,
              ),
              padding: EdgeInsets.fromLTRB(0, 50, 0, 0),
            ),
            // Container(
            //     child: GestureDetector(
            //   onLongPress: () {
            //     print('Clicked');
            //   },
            //   child: Container(
            //     height: 50.0,
            //     width: 100.0,
            //     padding: EdgeInsets.all(0.0),
            //     decoration: BoxDecoration(
            //       color: Colors.lightBlueAccent,
            //       borderRadius: BorderRadius.circular(17.0),
            //     ),
            //     child: Center(child: Text('Click me')),
            //   ),
            // )),

            Center(
              child: IconButton(
                icon: Icon(Icons.settings),
                color: Colors.blue,
                onPressed: () {
                  Navigator.push(context,
                      MaterialPageRoute(builder: (context) => loginpage()));
                },
                alignment: Alignment(0, 100),
              ),
            ),
            Container(
              child: TextButton(
                onPressed: () {
                  Navigator.push(context,
                      MaterialPageRoute(builder: (context) => loginpage()));
                },
                child: Text('Log into another account'),
              ),
              padding: EdgeInsets.fromLTRB(0, 410, 0, 0),
            ),
            Container(
              child: TextButton(
                onPressed: () {
                  Navigator.push(context,
                      MaterialPageRoute(builder: (context) => loginpage()));
                },
                child: Text('Sign up for Facebook'),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
