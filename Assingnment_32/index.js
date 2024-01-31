const problems = [
  {
    id: 1,
    description: " What is the result of the following expression?",
    solution: ["4", "'22'", "22", "NaN"],
    correct: 1,
  },
  {
    id: 2,
    description:
      "How do you check if a variable is of type 'string' in JavaScript?",
    solution: [
      `typeof variable === "text"`,
      `variable.type === "string"`,
      `typeof variable === "string"`,
      `variable instanceof String`,
    ],
    correct: 2,
  },
  {
    id: 3,
    description: "What is the correct way to create a new array in JavaScript?",
    solution: [
      `let arr = new Array()`,
      `let arr = []`,
      `let arr = {}`,
      `let arr = array()`,
    ],
    correct: 1,
  },
  {
    id: 4,
    description:
      " What is the purpose of the querySelector method in JavaScript?",
    solution: [
      "To select the first element that matches a specified CSS selector",
      "To query the user for input",
      "To query the server for data",
      "To query the database for information",
    ],
    correct: 0,
  },
  {
    id: 5,
    description:
      " How can you prevent the default behavior of a form submission?",
    solution: [
      "event.defaultPrevented = true;",
      "event.preventDefault();",
      "event.stopDefault();",
      "event.preventSubmission();",
    ],
    correct: 1,
  },
  {
    id: 6,
    description: "What does the === operator in JavaScript do?",
    solution: [
      "Compares values for equality without type coercion",
      "Performs a strict equality comparison with type coercion",
      "Compares values for inequality without type coercion",
      "Performs a loose equality comparison with type coercion",
    ],
    correct: 0,
  },
  {
    id: 7,
    description:
      "How do you add a new element to the end of an array in JavaScript?",
    solution: [
      "arr.add(element)",
      "arr.push(element)",
      "arr.append(element)",
      "arr.addToEnd(element)",
    ],
    correct: 1,
  },
  {
    id: 8,
    description:
      "What is the purpose of the setTimeout function in JavaScript?",
    solution: [
      "Delays the execution of a function for a specified number of milliseconds",
      "Sets a timer to repeat a function at regular intervals",
      "Measures the time elapsed between two points",
      "Pauses the execution of a script for a specified duration",
    ],
    correct: 0,
  },
  {
    id: 9,
    description: "What does the this keyword refer to in JavaScript?",
    solution: [
      "The current function",
      "The global object",
      " The object that owns the function",
      " A reference to the parent function",
    ],
    correct: 2,
  },
  {
    id: 10,
    description:
      "What does the localStorage object in JavaScript allow you to do?",
    solution: [
      "Store data as cookies",
      "Store data on the server",
      "Store data locally on the user's device",
      "Store data in the browser's cache",
    ],
    correct: 2,
  },
];

let ind = -1;
let selected_Question = null;
let count = 0;

function start() {
  const container = document.getElementById("container");
  container.innerHTML = ``;
  let div = document.createElement("div");
  div.setAttribute("class", "container__content");

  let h2 = document.createElement("h2");
  h2.innerText = "JavaScript Quiz";
  h2.setAttribute("class", "container__title");
  div.append(h2);

  container.append(div);

  let div2 = document.createElement("div");
  div2.setAttribute("class", "question-container");
  div2.setAttribute("id", "question-container");

  container.append(div2);

  nextQuestion();
}

function nextQuestion() {
  ind++;
  if (ind >= problems.length) {
    console.log(ind)
    result();
  } else {
    let question = problems[ind];
    selected_Question = question;
    let container = document.getElementById("question-container");
    container.innerHTML = ``;

    let h = document.createElement("h3");
    h.innerText = "Question " + question.id;
    container.append(h);

    let p = document.createElement("p");
    p.innerText = question.description;
    container.append(p);

    let div = document.createElement("div");

    question.solution.forEach((solution, index) => {
      let button = document.createElement("button");
      button.innerText = solution;
      button.setAttribute("class", "btn1");
      button.setAttribute("id", index);

      button.addEventListener("click", checkSolution);

      div.append(button);
    });

    container.append(div);
  }
}

function checkSolution() {
  if (+this.id === selected_Question.correct) count++;

  let btn = document.getElementById(this.id);
  btn.style.backgroundColor = "red";
  btn.style.color = "white";

  btn = document.getElementById(selected_Question.correct);
  btn.style.backgroundColor = "green";
  btn.style.color = "white";

  let btns = document.querySelectorAll(".btn1");
  btns.forEach((item) => {
    item.removeEventListener("click", checkSolution);
  });

  let container = document.getElementById("question-container");

  let div = document.createElement("div");
  div.setAttribute("id", "container__next");
  div.setAttribute("class", "container__next");

  let btn1 = document.createElement("button");
  btn1.setAttribute("id", "reset");
  btn1.setAttribute("class", "btn2");
  btn1.innerHTML = `<i class="fa-solid fa-angles-left"></i> Reset`;
  btn1.addEventListener("click", reset);

  let btn2 = document.createElement("button");
  btn2.setAttribute("id", "next");
  btn2.setAttribute("class", "btn3");
  btn2.innerHTML = `Next<i class="fa-solid fa-angles-right"></i>`;
  btn2.addEventListener("click", nextQuestion);

  div.append(btn1);
  div.append(btn2);

  container.append(div);
}

function reset() {
  ind = -1;
  nextQuestion();
}

function result() {
  let container = document.getElementById("container");
  container.innerHTML = ``;
  container.style.width = "100vw";
  container.classList.add("flex_box");

  let div = document.createElement("div");
  div.setAttribute('class', "result_container");
  
  let h1 = document.createElement("h1");
  let img = document.createElement("img");
  let p = document.createElement("p");
  let btn = document.createElement("button");

  if (count >= problems.length * 0.7) {
    container.style.backgroundColor = "#e8f9ee";

    h1.innerText = "JavaScript Quiz Passed";
    img.setAttribute("src", "./check.png");
    p.innerText = "Congratulations, keep up the good work!";
    btn.innerText = "Well Done!";
    btn.setAttribute("class", "btn5");
  } else {
    container.style.backgroundColor = "#fff7e5";

    h1.innerText = "JavaScript Quiz Failed";
    img.setAttribute("src", "./warning.png");
    p.innerText = "Sorry, You didn't pass the quiz. Please try again.";
    btn.setAttribute("class", "btn4");
    btn.innerText = "Retry";

    btn.addEventListener('click', restart);
  }

  div.append(h1);
  div.append(img);
  div.append(p);
  div.append(btn);

  container.append(div);
}


function restart(){
  location.reload();
}