import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:random_app/controllers/YesNoController.dart';
import 'package:random_app/screens/menu.dart';

class YesNo extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    var word = "Yes";
    return Scaffold(
      appBar: AppBar(
          backgroundColor: Colors.orange,
          title: const Text("Yes or No"),
          leading: IconButton(
            onPressed: () => Get.to(() => MenuScreen()),
            icon: Icon(Icons.home),
          )),
      body: Column(
        children: [
          Container(
            width: double.infinity,
            margin: EdgeInsets.all(10),
            child: ElevatedButton(
              style: ElevatedButton.styleFrom(
                primary: Colors.blue,
                onPrimary: Colors.white,
              ),
              child: Text(
                "Yes or No",
                style: TextStyle(fontSize: 30),
              ),
              onPressed: () {
                word = getRandomYesNo();
              }
            ),
          ),
          Center(
            child: Text(
              word,
              style: TextStyle(fontSize: 30),
            ),
          )
        ],
      ),
    );
  }
}
