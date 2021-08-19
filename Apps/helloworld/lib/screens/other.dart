import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:helloworld/controllers/counterController.dart';

class OtherScreen extends StatelessWidget {
  final CounterController _counterController = Get.find();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: [
          Center(
              child: Text(
            "Screen was clicked: ${_counterController.counter.value}",
            style: TextStyle(fontSize: 50),
          )),
          SizedBox(
            height: 10,
          ),
          Center(
            child: ElevatedButton(
                onPressed: () {
                  print("CLICK");
                  () => Get.back();
                },
                child: Text("Open other screen")),
          )
        ],
      ),
    );
  }
}
