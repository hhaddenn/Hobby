import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:random_app/screens/yesno.dart';

class MenuScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          backgroundColor: Colors.orange,
          title: const Text("Random Things Of Life"),
        ),
        body: Column(
          children: [
            ElevatedButton(
                onPressed: ()=>Get.to(()=>YesNo()),
                child: Text(
                  "Yes or No",
                  style: TextStyle(fontSize: 30),
                )),
            ElevatedButton(
              onPressed: null, 
              child: Text(
                "Heads or Tails",
                style: TextStyle(fontSize: 30),
              )),
            ElevatedButton(
              onPressed: null, 
              child: Text(
                "Number 1 to 10",
                style: TextStyle(fontSize: 30),
              )),
          ],
        ));
  }
}
