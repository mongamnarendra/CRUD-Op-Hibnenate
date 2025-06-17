here i used hibernate 7.0.2 version in this version the CRUD operation method names are changed they are:-
<table border="1" cellspacing="0" cellpadding="5">
  <thead>
    <tr>
      <th>Older </th>
      <th>New</th></th>
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
        <b>saveOrUpdate() or update()</b> either saves or updates depending on the entity's state.<br>
        <b>merge()</b> copies the state of a detached entity to a persistent one and returns the updated instance.
      </td>
    </tr>
    <tr>
      <td>delete(Object)</td>
      <td>remove(Object)</td>
      <td>Removes the persistent entity from the database.</td>
    </tr>
  </tbody>
</table>

