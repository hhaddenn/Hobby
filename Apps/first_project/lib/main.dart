import 'package:first_project/result.dart';
import 'package:flutter/material.dart';

import './quiz.dart';
import 'result.dart';

// void main() {
//   runApp(MyApp());
// }

void main() => runApp(MyApp());

class MyApp extends StatefulWidget {
  @override
  State<StatefulWidget> createState() {
    // TODO: implement createState
    return _MyAppState();
  }
}

class _MyAppState extends State<MyApp> {
  final _questions = const [
    {
      'questionText': 'What\'s your favourite color?',
      'answers': [
        {'text': 'Black' , 'score': 9},
        {'text': 'Red'   , 'score': 1},
        {'text': 'Green' , 'score': 4},
        {'text': 'Yellow', 'score': 7}
      ],
    },
    {
      'questionText': 'What\'s your favourite animal?',
      'answers': [
        {'text': 'Hamster', 'score': 4},
        {'text': 'Dog'    , 'score': 2},
        {'text': 'Octopus', 'score': 8},
        {'text': 'Otter'  , 'score': 6}
      ],
    },
    {
      'questionText': 'Who\'s your favourite movie genre?',
      'answers': [
        {'text': 'Horror' , 'score': 10},
        {'text': 'Comedy' , 'score': 4},
        {'text': 'Romance', 'score': 2},
        {'text': 'Action' , 'score': 6}
      ],
    },
  ];
  var _questionIndex = 0;
  var _totalScore = 0;

  void _resetQuiz() {
    setState(() {
      _questionIndex = 0;
      _totalScore = 0;
    });
  }

  void _answerQuestion(int score) {

    _totalScore += score;

    setState(() {
      _questionIndex = _questionIndex + 1;
    });
    print(_questionIndex);
    if (_questionIndex < _questions.length) {
      print('We have more questions!');
    } else {
      print('We don\'t have more questions!');
    }
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('Personality Test'),
        ),
        body: _questionIndex < _questions.length
            ? Quiz(
                answerQuestion: _answerQuestion,
                questionIndex: _questionIndex,
                questions: _questions,
              )
            : Result(_totalScore, _resetQuiz),
      ),
    );
  }
}
