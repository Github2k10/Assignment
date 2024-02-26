import "./form.scss";

const FormPage = (props) => {
  

  const submitForm = (event) => {
    event.preventDefault();

    const tags = [];
    if (event.srcElement[3].checked) tags.push("work");
    if (event.srcElement[4].checked) tags.push("study");
    if (event.srcElement[5].checked) tags.push("entertainment");
    if (event.srcElement[6].checked) tags.push("other");

    if (tags.length == 0) tags.push("other");

    const newTask = {
      title: event.srcElement[1].value,
      description: event.srcElement[2].value,
      tasks: tags,
      completed: false,
    };

    const newTasks = [...props.tasks, newTask];
    props.taskSetter(newTasks);
    localStorage.setItem("tasks", JSON.stringify(newTasks));

    props.hideForm(false);
  };
  return (
    <>
      <div className="add-task">
        <form className="add-task-container" onSubmit={() => submitForm(event)}>
          <div className="add-button">
            <p onClick={() => props.hideForm(false)}>Cancel</p>
            <button type="submit">Add</button>
          </div>
          <label htmlFor="title">
            <p>Title</p>
          </label>
          <input type="text" id="title" placeholder="add a title..." required />
          <label htmlFor="description">
            <p>Description</p>
          </label>
          <textarea
            id="description"
            placeholder="add a description..."
            required
          ></textarea>
          <h3>Tages</h3>
          <div className="tag-section">
            <div>
              <input type="checkbox" id="forWork" />
              <label htmlFor="forWork">Work</label>
            </div>

            <div>
              <input type="checkbox" id="forStudy" />
              <label htmlFor="forStudy">Study</label>
            </div>

            <div>
              <input type="checkbox" id="forEntertainment" />
              <label htmlFor="forEntertainment">Entertainment</label>
            </div>

            <div>
              <input type="checkbox" id="forOther" />
              <label htmlFor="forOther">other</label>
            </div>
          </div>
        </form>
      </div>
    </>
  );
};

export default FormPage;
