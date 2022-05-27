import 'package:flutter/material.dart';
import 'package:get/get.dart';
import 'package:random_app/screens/menu.dart';

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return GetMaterialApp(
      title: 'RTOL',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      initialRoute: "/",
      getPages: [
        GetPage(name: "/", page: ()=>MenuScreen())
      ],
      debugShowCheckedModeBanner: false,
    );
  }
}
