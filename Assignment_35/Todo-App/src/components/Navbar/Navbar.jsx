import { useEffect, useState } from "react";
import FormPage from "../form/form";
import "./Navbar.scss";

const Navbar = (props) => {
  const [show, setShow] = useState(false);

  useEffect(() => {
    const body = document.querySelector("body");
    body.style.overflow = show ? "hidden" : "auto";
  }, [show]);
  return (
    <>
      <div className="navbar">
        <h1 className="title">todo</h1>
        <i onClick={() => setShow(true)} className="fa-solid fa-plus"></i>
        {show && (
          <FormPage
            className="form"
            taskSetter={props.taskSetter}
            hideForm={setShow}
            tasks={props.tasks}
          />
        )}
      </div>
    </>
  );
};

export default Navbar;
