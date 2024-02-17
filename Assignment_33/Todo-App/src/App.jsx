import { useState } from "react";

import { Navbar } from "./components";
import { SideBar, Task } from "./container";
import "./App.scss";

function App() {
  const [tasks, setTasks] = useState(
    JSON.parse(localStorage.getItem("tasks")) || [
      {
        title: "Demo Task 1",
        description:
          "Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take t  hem as side lengths of a triangle.",
        tasks: ["work", "study", "entertainment", "other"],
        completed: true,
      },
      {
        title: "Demo Task 2",
        description:
          "Given an integer array nums, return the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.",
        tasks: ["work", "study", "entertainment", "other"],
        completed: false,
      },
    ]
  );

  return (
    <>
      <div className="App">
        <Navbar taskSetter={setTasks} tasks={tasks} />
        <div className="main">
          <SideBar tasks={tasks} taskSetter={setTasks} />
        </div>
      </div>
    </>
  );
}

export default App;
