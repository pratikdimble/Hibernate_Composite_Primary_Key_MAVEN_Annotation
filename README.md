# Hibernate_Composite_Primary_Key_MAVEN_Annotation

# To map a composite key, you can use the EmbeddedId or the IdClass annotations.

# A composite primary key must correspond to either a single persistent field or property or to a set of such fields or properties as described below. A primary key class must be defined to represent a composite primary key. Composite primary keys typically arise when mapping from legacy databases when the database key is comprised of several columns. The EmbeddedId and  IdClass annotations are used to denote composite primary keys.

...
# The following rules apply for composite primary keys:

  # 1.The primary key class must be public and must have a public no-arg constructor.
  # 2.If property-based access is used, the properties of the primary key class must be public or protected.
  # 3.The primary key class must be serializable.
  # 4.The primary key class must define equals and hashCode methods. The semantics of value equality for these methods must be consistent     with the database equality for the database types to which the key is mapped.
  # 5. A composite primary key must either be represented and mapped as an embeddable class (“EmbeddedId Annotation”)     or must be represented and mapped to multiple fields or properties of the entity class (“IdClass Annotation”).
  # 6.If the composite primary key class is mapped to multiple fields or properties of the entity class, the names of primary key fields        or properties in the primary key class and those of the entity class must correspond and their types must be the same.
