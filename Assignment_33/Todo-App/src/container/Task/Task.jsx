import "./Task.scss";

const Task = (props) => {
  const changeState = (task) => {
    task.completed = !task.completed;
    for (let i = 0; i < props.tasks.length; i++) {
      if (props.tasks[i].title === task.title) {
        props.tasks[i] = task;
      }
    }
    const newTasks = [...props.tasks];
    props.taskSetter(newTasks);
    localStorage.setItem("tasks", JSON.stringify(newTasks));
  };

  const deleteTask = (task) => {
    for (let i = 0; i < props.tasks.length; i++) {
      if (props.tasks[i] === task) {
        props.tasks.splice(i, 1);
        break;
      }
    }

    const newTasks = [...props.tasks];
    props.taskSetter(newTasks);
    localStorage.setItem("tasks", JSON.stringify(newTasks));
  };
  return (
    <div className="tasks-list">
      {console.log(props.data)}
      {props.data.map((task) => (
        <div key={task.title} className="task">
          <div className="title-box">
            <h3
              className="title"
              style={task.completed ? { textDecoration: "line-through" } : null}
            >
              {task.title}
            </h3>
            <i
              onClick={() => deleteTask(task)}
              className="fa-regular fa-trash-can"
            ></i>
          </div>
          <p
            className="description"
            style={task.completed ? { textDecoration: "line-through" } : null}
          >
            {task.description}
          </p>
          <div className="tag-box">
            <div className="task-tags">
              {task.tasks.map((tag) => (
                <div
                  key={`${task.title}-${tag}`}
                  className={`item ${tag}`}
                ></div>
              ))}
            </div>
            <div className="hide">
              <input
                type="checkbox"
                id="flexCheckDefault"
                checked={task.completed}
                onChange={() => changeState(task)}
              />
              <label htmlFor="flexCheckDefault">Done</label>
            </div>
          </div>
        </div>
      ))}
    </div>
  );
};

export default Task;
