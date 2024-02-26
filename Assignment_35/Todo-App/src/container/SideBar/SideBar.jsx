import "./SideBar.scss";
import Task from "../Task/Task";
import { useEffect, useState } from "react";

const SideBar = (props) => {
  const [filter, setFilter] = useState([]);
  const [hide, setHide] = useState(false);
  const [active, setActive] = useState("");

  useEffect(() => {
    if (hide) {
      setFilter(props.tasks.filter((task) => !task.completed));
    } else {
      setFilter(props.tasks);
    }
  }, [hide]);

  const clickHandler = (category) => {
    setFilter(filter.filter((task) => task.tasks.includes(category)));
    setActive(category);
  };

  return (
    <>
      <div className="sidebar">
        <div className="sidebar-item">
          <div className="outer-item">
            <div className="item work"></div>
            <p
              style={active === "work" ? { color: "#d2ceff" } : null}
              onClick={() => clickHandler("work")}
            >
              work
            </p>
          </div>
          <div className="outer-item">
            <div className="item study"></div>
            <p
              style={active === "study" ? { color: "#d1e5f7" } : null}
              onClick={() => clickHandler("study")}
            >
              study
            </p>
          </div>
          <div className="outer-item">
            <div className="item entertainment"></div>
            <p
              style={active === "entertainment" ? { color: "#ffcece" } : null}
              onClick={() => clickHandler("entertainment")}
            >
              entertainment
            </p>
          </div>
          <div className="outer-item">
            <div className="item other"></div>
            <p
              style={active === "other" ? { color: "#d9f1d5" } : null}
              onClick={() => clickHandler("other")}
            >
              other
            </p>
          </div>
        </div>
        <div className="hide">
          <input
            type="checkbox"
            id="flexCheckDefault"
            onClick={() => setHide(!hide)}
          />
          <label htmlFor="flexCheckDefault">Hide Done Tasks</label>
        </div>
      </div>

      <div className="task-list">
        <Task tasks={props.tasks} data={filter} taskSetter={props.taskSetter} />
      </div>
    </>
  );
};

export default SideBar;
