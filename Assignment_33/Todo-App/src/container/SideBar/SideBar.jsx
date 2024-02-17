import "./SideBar.scss";
import Task from "../Task/Task";
import { useEffect, useState } from "react";

const SideBar = (props) => {
  const [filter, setFilter] = useState([]);
  const [hide, setHide] = useState(false);

  useEffect(() =>{
    if(hide){
      setFilter(props.tasks.filter((task) => !task.completed));
    } else {
      setFilter(props.tasks);
    }
  }, [hide]);

  return (
    <>
      <div className="sidebar">
        <div className="sidebar-item">
          <div className="outer-item">
            <div className="item work"></div>
            <p>work</p>
          </div>
          <div className="outer-item">
            <div className="item study"></div>
            <p>study</p>
          </div>
          <div className="outer-item">
            <div className="item entertainment"></div>
            <p>entertainment</p>
          </div>
          <div className="outer-item">
            <div className="item other"></div>
            <p>other</p>
          </div>
        </div>
        <div className="hide">
          <input type="checkbox" id="flexCheckDefault" onClick={() => setHide(!hide)} />
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
