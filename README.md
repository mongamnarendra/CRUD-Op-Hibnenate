here i used hibernate 7.0.2 version in this version the CRUD operation method names are changed they are:-
<table border="1" cellspacing="0" cellpadding="5">
  <thead>
    <tr>
      <th>Session Method 1</th>
      <th>Session Method 2</th>
      <th>Description</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>load(Class&lt;T&gt; entityClass, int id)</td>
      <td>get(Class&lt;T&gt; entityClass, int id)</td>
      <td>
        <b>load()</b> returns a proxy object (lazy loading); throws exception if not found.<br>
        <b>get()</b> hits the DB immediately and returns actual object or null if not found.
      </td>
    </tr>
    <tr>
      <td>save(Object)</td>
      <td>persist(Object)</td>
      <td>
        Both insert a new record.<br>
        <b>save()</b> returns the generated identifier.<br>
        <b>persist()</b> is JPA standard and returns void.
      </td>
    </tr>
    <tr>
      <td>saveOrUpdate(Object)</td>
      <td>merge(Object)</td>
      <td>
        <b>saveOrUpdate()</b> either saves or updates depending on the entity's state.<br>
        <b>merge()</b> copies the state of a detached entity to a persistent one and returns the updated instance.
      </td>
    </tr>
    <tr>
      <td>delete(Object)</td>
      <td>—</td>
      <td>Removes the persistent entity from the database.</td>
    </tr>
    <tr>
      <td>update(Object)</td>
      <td>—</td>
      <td>Updates the entity in the database. Works only with a persistent object.</td>
    </tr>
    <tr>
      <td>—</td>
      <td>refresh(Object)</td>
      <td>Re-fetches the object from the database, overwriting local changes.</td>
    </tr>
    <tr>
      <td>—</td>
      <td>clear()</td>
      <td>Clears the session by detaching all persistent objects.</td>
    </tr>
    <tr>
      <td>—</td>
      <td>flush()</td>
      <td>Forces Hibernate to synchronize the current state of the session with the database.</td>
    </tr>
  </tbody>
</table>

